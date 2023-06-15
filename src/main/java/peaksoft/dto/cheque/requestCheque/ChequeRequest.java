package peaksoft.dto.cheque.requestCheque;

import lombok.Builder;

import java.time.ZonedDateTime;
@Builder
public record ChequeRequest(int priceAverage, ZonedDateTime createdAt) {
}
