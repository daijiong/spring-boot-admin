FROM registry.cn-hangzhou.aliyuncs.com/djflying/base-image:1.0.0
LABEL author="daijiong"
RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN mkdir -p /spring-boot-admin
WORKDIR /spring-boot-admin
EXPOSE 9002
ADD ./target/spring-boot-admin.jar ./
CMD sleep 10;java -Dfile.encoding=utf-8 -Djava.security.egd=file:/dev/./urandom -jar spring-boot-admin.jar