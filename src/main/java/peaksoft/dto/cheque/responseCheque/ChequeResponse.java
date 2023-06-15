package peaksoft.dto.cheque.responseCheque;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;
@Builder
@Getter
@Setter
public class ChequeResponse {
    private Long id;
    private int priceAverage;
    private ZonedDateTime createdAt;

    public ChequeResponse(Long id, int priceAverage, ZonedDateTime createdAt) {
        this.id = id;
        this.priceAverage = priceAverage;
        this.createdAt = createdAt;
    }
}
