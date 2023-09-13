Database


CREATE TABLE `admin` (
`id` int NOT NULL AUTO_INCREMENT,
`username` varchar(45) NOT NULL,
`password` varchar(255) NOT NULL,
PRIMARY KEY (`id`)
)
INSERT INTO `admin` VALUES (1,'admin','$2y$10$xIK2wvEhjxgxeCQvlPfa3eOiW833fYJ1MXTlXx3U5jgqU1oNwlNTa');



CREATE TABLE `users` (
`id` int NOT NULL AUTO_INCREMENT,
`username` varchar(45) NOT NULL,
`password` varchar(255) NOT NULL,
`email` varchar(45) NOT NULL,
`phone_number` varchar(45) NOT NULL,
PRIMARY KEY (`id`)
)
INSERT INTO `users` VALUES (1,'Tuan ngoc','$2a$10$bGhZfIXHzovtoRXUGe7Z5.WrQOffSz615MUOHLZRz7hqvnr25aPsa','ngoc@email.com','3123456'),(2,'Ngoc123','$2a$10$KP2..LbNsQ.4ZlkH0pyIkei.LMFBUjCZw.VIfbkd5outO0CdNUdFm','ngoc@email.com','123456');



CREATE TABLE `categories` (
`id` int NOT NULL AUTO_INCREMENT,
`name` varchar(45) NOT NULL,
`slug` varchar(45) NOT NULL,
`sorting` int NOT NULL,
PRIMARY KEY (`id`)
)
INSERT INTO `categories` 
VALUES (1,'Cake','cake',2),
(4,'Fruits','fruits',1);



CREATE TABLE `pages` (
`id` int NOT NULL AUTO_INCREMENT,
`title` varchar(45) NOT NULL,
`slug` varchar(45) NOT NULL,
`content` text NOT NULL,
`sorting` int NOT NULL,
PRIMARY KEY (`id`)
)
INSERT INTO `pages` VALUES 
(1,'Home','home','<h2>Home Page</h2><p>home page text</p><p>&nbsp;</p>',0),(2,'Service','service','<h2>Services</h2><p>&nbsp;</p><p><strong>Lorem Ipsum</strong> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>',1),(4,'About us','about-us','<h2>About us</h2><p>&nbsp;</p><p><strong>Lorem Ipsum</strong> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>',2),(12,'Contact','contact','<h2>Contact</h2><p><strong>Lorem Ipsum</strong> is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>',100);



CREATE TABLE `products` (
`id` int NOT NULL AUTO_INCREMENT,
`name` varchar(45) NOT NULL,
`slug` varchar(45) NOT NULL,
`description` text NOT NULL,
`image` varchar(45) NOT NULL,
`price` decimal(8,2) NOT NULL,
`category_id` int NOT NULL,
`created_at` datetime NOT NULL,
`updated_at` datetime NOT NULL,
PRIMARY KEY (`id`),
KEY `category_id` (`category_id`),
CONSTRAINT `category_id_fk` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE
)
INSERT INTO `products` VALUES
INSERT INTO `products` VALUES
(4,'Apple','apple','<p>Nice <strong>apples</strong></p>','apples.jpg',1.99,4,'2021-01-25 10:19:22','2021-01-25 11:28:06'),
(5,'Banana','banana','Tasty bananas','bananas.jpg',3.99,4,'2021-01-25 10:19:51','2021-01-25 10:19:51'),
(8,'Grape fruit','grape-fruit','Juicy grapefruit','grapefruit.jpg',3.90,4,'2021-01-25 10:21:34','2021-01-25 10:21:34'),
(9,'Grapes','grapes','Great grapes','grapes.jpg',2.50,4,'2021-01-25 10:21:57','2021-01-25 10:21:57'