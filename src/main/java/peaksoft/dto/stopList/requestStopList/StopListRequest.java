package peaksoft.dto.stopList.requestStopList;

import lombok.Builder;

import java.time.ZonedDateTime;
@Builder
public record StopListRequest(String reason, ZonedDateTime date) {
}
