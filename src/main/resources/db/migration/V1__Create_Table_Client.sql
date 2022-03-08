CREATE TABLE `client` (
  `id` INT(10) AUTO_INCREMENT PRIMARY KEY,
  `name` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `document` varchar(11) NOT NULL,
  `income` numeric(10,2) NOT NULL,
  `birth_date` DATE NOT NULL,
  `gender` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
