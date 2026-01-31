# Docker Practice

Docker, Docker Compose, Testcontainers, Cucumber를 활용한 재현 가능한 개발 환경 구축 실습

## 기술 스택

- **Application**: Spring Boot 4.0, Java 17
- **Database**: MySQL 8.0
- **Cache**: Redis 7
- **Message Broker**: Apache Kafka 3.7.0
- **Testing**: Testcontainers, Cucumber, JUnit 5

## 시스템 실행 방법

```bash
docker-compose up -d --build
```

실행 후 헬스 체크:
```bash
curl http://localhost:8080/health
# 정상 응답: OK
```

## 테스트 실행 방법

```bash
./gradlew test
```

테스트는 Testcontainers를 사용하여 docker-compose 없이 독립적으로 실행됩니다.

## API 엔드포인트

| Method | Path | Description |
|--------|------|-------------|
| GET | /health | 헬스 체크 (OK 반환) |

## 실행 결과 스크린샷
![스크린샷](https://github.com/user-attachments/assets/90197934-5db8-4f0b-9217-c6ded4b60851)
