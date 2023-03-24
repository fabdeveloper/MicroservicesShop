mkdir microservices
cd microservices
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=product-service --package-name=fab.shop.microservices.core.product --groupId=fab.shop.microservices.core.product --dependencies=actuator,webflux --version=1 product-service
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=cart-service --package-name=fab.shop.microservices.core.cart --groupId=fab.shop.microservices.core.cart --dependencies=actuator,webflux --version=1 cart-service
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=purchase-service --package-name=fab.shop.microservices.core.purchase --groupId=fab.shop.microservices.core.purchase --dependencies=actuator,webflux --version=1 purchase-service
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=users-service --package-name=fab.shop.microservices.core.users --groupId=fab.shop.microservices.core.users --dependencies=actuator,webflux --version=1 users-service
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=till-service --package-name=fab.shop.microservices.core.till --groupId=fab.shop.microservices.core.till --dependencies=actuator,webflux --version=1 till-service
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=shop-composite-service --package-name=fab.shop.microservices.composite.shop --groupId=fab.shop.microservices.composite.shop --dependencies=actuator,webflux --version=1 shop-composite-service
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=valuation-service --package-name=fab.shop.microservices.core.valuation --groupId=fab.shop.microservices.core.valuation --dependencies=actuator,webflux --version=1 valuation-service
cd ..
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=api --package-name=fab.shop.api --groupId=fab.shop.api --dependencies=actuator,webflux --version=1 api
spring init --boot-version=2.5.2 --build=gradle --java-version=1.8 --packaging=jar --name=util --package-name=fab.shop.util --groupId=fab.shop.util --dependencies=actuator,webflux --version=1 util



