package edu.pavliuk.show;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Show {
    Integer id;
    String name;
    Long duration;
    Integer act;
    String description;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
