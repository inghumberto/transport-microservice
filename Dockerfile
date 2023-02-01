FROM maven:3.8.2-jdk-8
WORKDIR /app
COPY . .
COPY ./run.sh /
ENTRYPOINT ["sh", "/run.sh"]