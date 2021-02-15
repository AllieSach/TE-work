#!/bin/bash
export PGPASSWORD='postgres1'

psql -U postgres -f "./dropdb.sql" &&
createdb -U postgres animal_hospital &&
psql -U postgres -d animal_hospital -f "./animal_hospital.sql" 