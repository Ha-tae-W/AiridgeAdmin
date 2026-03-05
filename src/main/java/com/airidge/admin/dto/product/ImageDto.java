package com.airidge.admin.dto.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ImageDto {

    @Id
    private Long id;

}
