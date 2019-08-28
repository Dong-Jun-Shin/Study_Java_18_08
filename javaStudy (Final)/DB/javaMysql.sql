show databases;

drop database member; /*DB삭제*/

create database member; /*DB생성*/

use member; /*DB사용*/

show tables; /*선택 DB안의 테이블*/

create table memberJoin(
userId varchar(100) not null,
userPw varchar(100) not null,
userAge int(4) not null,
primary key(userId)
) default charset=utf8;
/*오전 수업 코드*/

create table if not exists joinMember(
userId varchar(100) not null,
userPw varchar(100) not null,
userName varchar(100) not null,
userAge int(4) not null,
userGender varchar(10) not null,
userPhone varchar(200) not null,
userHobbys varchar(300) not null,
primary key(userId)
) default charset=utf8;

insert into joinMember(userId, userPw, userName, userAge, userGender, userPhone, userHobbys) values('m1', '11','s1',11,'M','010-0000-0001', '등산');
insert into joinMember(userId, userPw, userName, userAge, userGender, userPhone, userHobbys) values('m2', '22','s2',21,'M','010-0000-0002', '여행');
insert into joinMember(userId, userPw, userName, userAge, userGender, userPhone, userHobbys) values('m3', '33','s3',31,'M','010-0000-0003', '영화감상');
insert into joinMember(userId, userPw, userName, userAge, userGender, userPhone, userHobbys) values('m4', '44','s4',41,'M','010-0000-0004', '독서');
insert into joinMember(userId, userPw, userName, userAge, userGender, userPhone, userHobbys) values('m5', '55','s5',51,'M','010-0000-0005', '축구');

select * from joinMember;
select * from joinMember where userId='m1';
desc joinMember;