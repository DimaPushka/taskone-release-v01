FROM openjdk:18
COPY ./out/production/GameRockPaperScissors/ /tmp
WORKDIR /tmp
EXPOSE 8001
ENTRYPOINT ["java", "Main", "Player", "VARIANTS"]