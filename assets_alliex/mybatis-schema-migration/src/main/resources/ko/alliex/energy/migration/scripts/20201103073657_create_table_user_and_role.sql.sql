--
--    Copyright 2010-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

-- // Create Changelog

-- Default DDL for changelog table that will keep
-- a record of the migrations that have been run.

-- You can modify this to suit your database before
-- running your first migration.

-- Be sure that ID and DESCRIPTION fields exist in
-- BigInteger and String compatible fields respectively.

CREATE TABLE `role_master` (
	`role_id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`role_identifier` VARCHAR ( 20 ) NULL,
	`role_name` VARCHAR ( 255 ) COLLATE utf8_unicode_ci NULL,
	`is_deleted` SMALLINT ( 4 ) DEFAULT 0,
	`created_uid` INT ( 0 ) NOT NULL,
	`created_at` datetime ( 0 ) NOT NULL,
	`updated_uid` INT ( 0 ) NOT NULL,
	`updated_at` datetime ( 0 ),
	PRIMARY KEY ( `role_id` )
) ENGINE = INNODB
    AUTO_INCREMENT = 1
    CHARACTER SET = utf8
    COLLATE = utf8_unicode_ci
    ROW_FORMAT = Dynamic;

CREATE TABLE `module_master` (
	`module_id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`module_identifier` VARCHAR ( 20 ) NULL,
	`module_name` VARCHAR ( 255 ) COLLATE utf8_unicode_ci NULL,
	`is_deleted` SMALLINT ( 4 ) DEFAULT 0,
	`created_uid` INT ( 0 ) NOT NULL,
	`created_at` datetime ( 0 ) NOT NULL,
	`updated_uid` INT ( 0 ) NOT NULL,
	`updated_at` datetime ( 0 ),
	PRIMARY KEY ( `module_id` )
) ENGINE = INNODB AUTO_INCREMENT = 1
    CHARACTER SET = utf8
    COLLATE = utf8_unicode_ci
    ROW_FORMAT = Dynamic;

CREATE TABLE `api_master` (
	`api_id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`module_identifier` VARCHAR ( 20 ) NULL,
	`api_url` VARCHAR ( 255 ) NULL,
	`api_method` VARCHAR ( 10 ) NULL,
	`is_deleted` SMALLINT ( 4 ) DEFAULT 0,
	`created_uid` INT ( 0 ) NOT NULL,
	`created_at` datetime ( 0 ) NOT NULL,
	`updated_uid` INT ( 0 ) NOT NULL,
	`updated_at` datetime ( 0 ),
	PRIMARY KEY ( `api_id` )
) ENGINE = INNODB AUTO_INCREMENT = 1
    CHARACTER SET = utf8
    COLLATE = utf8_unicode_ci
    ROW_FORMAT = Dynamic;

CREATE TABLE `module_role` (
	`module_role_id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`role_identifier` VARCHAR ( 20 ) NULL,
	`module_identifier` VARCHAR ( 20 ) NULL,
	`is_deleted` SMALLINT ( 4 ) DEFAULT 0,
	`created_uid` INT ( 0 ) NOT NULL,
	`created_at` datetime ( 0 ) NOT NULL,
	`updated_uid` INT ( 0 ) NOT NULL,
	`updated_at` datetime ( 0 ),
	PRIMARY KEY ( `module_role_id` ),
	CONSTRAINT `module_role_unique` UNIQUE (`role_identifier`,`module_identifier`)
) ENGINE = INNODB
    AUTO_INCREMENT = 1
    CHARACTER SET = utf8
    COLLATE = utf8_unicode_ci
    ROW_FORMAT = Dynamic;

CREATE TABLE `users` (
	`user_id` INT ( 11 ) NOT NULL AUTO_INCREMENT,
	`email` VARCHAR ( 100 ) COLLATE utf8_unicode_ci NULL,
	`password` VARCHAR ( 100 ) NULL,
	`first_name` VARCHAR ( 50 ) COLLATE utf8_unicode_ci NULL,
	`last_name` VARCHAR ( 50 ) COLLATE utf8_unicode_ci NULL,
	`role_identifier` VARCHAR ( 20 ) NULL,
	`is_deleted` SMALLINT ( 4 ) DEFAULT 0,
    `created_uid` INT ( 0 ) NOT NULL,
    `created_at` datetime ( 0 ) NOT NULL,
    `updated_uid` INT ( 0 ) NOT NULL,
    `updated_at` datetime ( 0 ),
	PRIMARY KEY ( `user_id` ),
    CONSTRAINT `email_unique` UNIQUE (`email`)
) ENGINE = INNODB
    AUTO_INCREMENT = 1
    CHARACTER SET = utf8
    COLLATE = utf8_unicode_ci
    ROW_FORMAT = Dynamic;

ALTER TABLE `users` AUTO_INCREMENT = 100;

-- //@UNDO
-- SQL to undo the change goes here.

drop table `users`;
drop table `module_role`;
drop table `api_master`;
drop table `module_master`;
drop table `role_master`;