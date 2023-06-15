package peaksoft.dto.stopList.responseStopList;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
@Builder
@Getter
@Setter
@NoArgsConstructor
public class StopListResponse {

    private Long id;
    private String reason;
    private ZonedDateTime date;

    public StopListResponse(Long id, String reason, ZonedDateTime date) {
        this.id = id;
        this.reason = reason;
        this.date = date;
    }
}
