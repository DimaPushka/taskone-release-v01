FROM openjdk:18 AS build
COPY ./out/production/GameRockPaperScissors/ /tmp
WORKDIR /tmp
EXPOSE 8001

FROM openjdk:18 AS runtime
WORKDIR /tmp/app
COPY --from=build /tmp .
ENTRYPOINT ["java", "Main", "Player", "VARIANTS"]