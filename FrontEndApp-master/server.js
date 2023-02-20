var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var cors = require('cors');

app.use(cors({credentials: true, origin: 'http://localhost:9090'}));

var PORT = 3000;
var username;
var password;
var basicauth;
app.use(express.static('.'));
app.use(bodyParser.urlencoded({ extended: true }));

app.post('/', (req, res) => {
    username=req.body.username;
    password=req.body.password;
    basicauth=Buffer.from(username+":"+password).toString("base64");
    //console.log(basicauth);
    
    res.redirect("/getRequest.html");
   // res.send(`Full name is:${username} ${password}.`);
  });

  app.get("/getvalues", (req,res) =>{
    let credentials = { 
      auth: basicauth
  };
  console.log(JSON.stringify(credentials));
   
  //let data = JSON.stringify(credentials);
  res.json(credentials);
  });

  app.post("/logout", (req,res)=>{
    username=null;
    password=null;
    basicauth=null;
    console.log("User logged out!")
    res.redirect("http://localhost:3000");
  });

  app.post("/error",(req,res)=>{
    console.log("error detected!\n Deleting previous credentials!");
    username=null;
    password=null;
    basicauth=null;
  });


app.listen(PORT, function() {
    console.log('Server listening on ' + PORT);
});