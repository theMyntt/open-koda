package org.openkoda.adapters.dao.tables;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "tbl_error_level")
public class ErrorLevelTable {
    @Id
    @Column(name = "id_error_level")
    private UUID id;

    @Column(name = "tx_label")
    private String label;

    @Column(name = "tx_level")
    private Integer level;

    @Column(name = "tx_created_at")
    private OffsetDateTime createdAt;
}
