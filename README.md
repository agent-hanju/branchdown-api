# Branchdown API

Branchdown API DTOs - 브랜칭 구조의 Append-Only 트리를 위한 공유 DTO 라이브러리

## DTOs

### PointDto

```java
PointDto.Response(Long id, Integer branchNum, Integer depth, String itemId, List<Integer> childBranchNums, Instant createdAt)
PointDto.DownRequest(String itemId)
```

### StreamDto

```java
StreamDto.Response(Long id, Instant createdAt)
```

### CommonResponseDto

```java
CommonResponseDto<T>(boolean success, T data, String message)
```

## 관련 프로젝트

- [branchdown](https://github.com/agent-hanju/branchdown) - 서버
- [branchdown-client](https://github.com/agent-hanju/branchdown-client) - 클라이언트 SDK
