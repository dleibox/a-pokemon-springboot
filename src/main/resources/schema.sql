DROP TABLE IF EXISTS pokemon_response;
CREATE TABLE pokemon_response (
	`uuid` UUID NOT NULL PRIMARY KEY,
	`json` VARCHAR(100000) NOT NULL,
	`created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`updated` timestamp
);

DROP TABLE IF EXISTS pokemon;
CREATE TABLE pokemon (
	`uuid` UUID NOT NULL PRIMARY KEY,
	`id` INTEGER NOT NULL UNIQUE,
	`name` VARCHAR(50) NOT NULL UNIQUE,
	`json` VARCHAR(300000) NOT NULL,
	`created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`updated` timestamp
);

DROP TABLE IF EXISTS ability;
CREATE TABLE ability (
	`uuid` UUID NOT NULL PRIMARY KEY,
	`id` INTEGER NOT NULL UNIQUE,
	`name` VARCHAR(50) NOT NULL UNIQUE,
	`json` VARCHAR(100000) NOT NULL,
	`created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`updated` timestamp
);