package com.example.account.dto;

import jakarta.validation.constraints.Min;
import lombok.*;

import java.time.LocalDateTime;

public class CreateAccount {
   @Getter @Setter
   @AllArgsConstructor
    public static class Request {
       @NonNull
       @Min(1)
        private Long userId;

       @NonNull
       @Min(0)
        private Long initialBalance;

    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private Long userId;
        private String accountNumber;
        private LocalDateTime registeredAt;

        public static Response from(AccountDto accountDto) {
            return Response.builder()
                    .userId(accountDto.getUserId())
                    .accountNumber(accountDto.getAccountNumber())
                    .registeredAt(accountDto.getRegisteredAt())
                    .build();
        }
    }
}
