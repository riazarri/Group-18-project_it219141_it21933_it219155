CREATE TABLE IF NOT EXISTS `user` (
    `username` varchar(50) NOT NULL,
    `password` varchar(100) NOT NULL,
    `enabled` tinyint(1) NOT NULL,
    PRIMARY KEY (`username`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `authorities` (
	`id` int not null auto_increment,
	`username` varchar(50) NOT NULL,
    `authority` varchar(50) NOT NULL,
    UNIQUE KEY `ix_auth_usernametest` (`username`,`authority`),
    CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `user` (`username`),
    PRIMARY KEY(`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `userDetails` (
    `username` varchar(50) NOT NULL,
    CONSTRAINT `userDetails_username` FOREIGN KEY (`username`) REFERENCES user (`username`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `forma` (
	`id` int not null auto_increment,
    `username` varchar(50) NOT NULL,
    `sub1` varchar(50) NOT NULL,
    `sub2` varchar(50) NOT NULL,
    `sub3` varchar(50) NOT NULL,
    `sub4` varchar(100) NOT NULL,
    `sub5` varchar(10) NOT NULL,
	`sub6` varchar(50),
    `sub7` varchar(50),
    `sub8` varchar(50),
    `sub9` varchar(50),
    `sub10` varchar(50),
    `sub11` varchar(50),
    `sub12` varchar(50),
    `sub13` varchar(50),
    `sub14` varchar(50),
    `sub15` varchar(50),
    `sub16` varchar(50),
    `sub17` varchar(50),
    `sub18` varchar(50),
    `teachername1`varchar(50) ,
    `teachername2`varchar(50) ,
    `state`varchar(50) NOT NULL,
    `state2`varchar(50) NOT NULL,
    primary key(`id`),
    CONSTRAINT `subs_username` FOREIGN KEY (`username`) REFERENCES user (`username`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `user` (`username`, `password`, `enabled`) VALUES #foreach user : username=password except root u:root p:pass123
    ('root', '$2a$04$DR/f..s1siWJc8Xg3eJgpeB28a4V6kYpnkMPeOuq4rLQ42mJUYFGC', 1),
    ('manager','$2a$10$.3ciSsMi7C595wu1XH5sIufKoEikV3UxL0T4dVOXHXBuT7Q6/V9va',1),
    ('lawyer2','$2a$12$zNaZsTSjvKoitKSe.MMZMedPtYFA8yUlrTszY/cBioOzLLIw0d.S6',1),
    ('simbolaiografos','$2a$12$Ndu5hAnH91JiId4Xcz9JmeeHUvrqHB2.NH8FRxtN/uC7U.yIyItL6',1),
    ('lawyer','$2a$12$ThB6fTptlzpeuw9clPF1ReC67dLiSHl7t.DHow3A8lrF7rYQYh3Rm',1 );

INSERT INTO `authorities` (`username`, `authority`) VALUES
('root', 'ROLE_ADMIN'),
('manager','ROLE_MANAGER'),
('lawyer2','ROLE_LAWYER'), #mpainei kai blepei tin aitisi 
('simbolaiografos', 'ROLE_SIMBOLAIOGRAFOS'), #mpainei kai blepei tin katastasi apo ton laywer kai an ola kl dinei to ok
('lawyer','ROLE_USER'); #sto mvc mpainei kai den blepei tpt

