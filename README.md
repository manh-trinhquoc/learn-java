# matterhorn.vn
- chạy lệnh:  composer install --no-dev

cd /var/www/html
cd ./wp-content/plugins/unit-tested-plugin
./bin/install-wp-tests.sh  db_test_theme root example db
./bin/install-wp-tests.sh "db_test_theme" "root" ""
./vendor/bin/phpunit --testsuite Grumphp
mysql -u root -p   example
cd /var/www/html/wp-content/themes/sunshine

// return all records
GET /person

// return a specific record
GET /person/{id}

// create a new record
POST /person

// update an existing record
PUT /person/{id}

// delete an existing record
DELETE /person/{id}