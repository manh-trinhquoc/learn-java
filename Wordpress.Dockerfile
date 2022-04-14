FROM wordpress:php7.4-fpm
RUN pecl install xdebug &&  docker-php-ext-enable xdebug