#!/bin/bash
if [ "$#" -ne 1 ]; then
	echo "Usage: $0 version"
	exit 1
fi
folder=$1
echo 'Deleting local database...';
echo 'drop database treasurehunt;'| mysql -uroot -proot
echo 'Creating local database treasurehunt...'
echo 'create database treasurehunt;'| mysql -uroot -proot
echo 'Adding Tables to database...'
mysql -uroot -proot treasurehunt < schema.sql
echo 'Adding Data to tables'
`mysql -uroot -proot treasurehunt < $folder/data.sql`
