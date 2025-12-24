package me.hanju.branchdown.api.dto;

import java.time.Instant;

/** Branchdown Stream DTO */
public class StreamDto {
  private StreamDto() {
  }

  public static record Response(
      Long id,
      Instant createdAt) {
  }
}
