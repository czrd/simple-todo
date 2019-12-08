package todo.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ToDo {

  @NotNull private String id;

  @NotNull @NotBlank private String description;

  private LocalDateTime created;

  private LocalDateTime updated;

  private boolean completed;

  public ToDo() {
    LocalDateTime date = LocalDateTime.now();
    this.id = UUID.randomUUID().toString();
    this.created = date;
    this.updated = date;
  }

  public ToDo(String description) {
    this();
    this.description = description;
  }
}
