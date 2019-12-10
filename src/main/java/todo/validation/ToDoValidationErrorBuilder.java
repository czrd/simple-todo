package todo.validation;

import org.springframework.validation.Errors;

public class ToDoValidationErrorBuilder {

  public static ToDoValidationError fromBindingErrors(Errors errors) {
    ToDoValidationError error =
        new ToDoValidationError("Validation failed. " + errors.getErrorCount() + " error(s)");
    errors.getAllErrors().forEach(e -> error.addValidationError(e.getDefaultMessage()));

    return error;
  }
}
