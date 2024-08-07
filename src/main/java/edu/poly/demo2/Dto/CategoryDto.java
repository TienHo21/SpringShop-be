package edu.poly.demo2.Dto;

import edu.poly.demo2.Domain.CategoryStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Value;
import org.aspectj.bridge.IMessage;

import java.io.Serializable;

/**
 * DTO for {@link edu.poly.demo2.Domain.Category}
 */
@Data
public class CategoryDto implements Serializable {
   private Long id;
   @NotEmpty(message = "Category name is required")
   private String name;
   private CategoryStatus status;
}