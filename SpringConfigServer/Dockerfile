# alpine을 통해 경량화 Linux 환경 조성
FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
# Pod 환경(컨테이너 환경) 구성하는 용도
# podman을 통해서 포드를 관리할 서비스를 만들었고 도커허브에서 이미지를 가져와서 포드를 생성함