package org.openkoda.adapters.dao.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tbl_issues")
public class IssueTable {
    @Id
    @Column(name = "id_issue", nullable = false)
    private UUID id;

    @Column(name = "tx_message", nullable = false)
    private String message;

    @Column(name = "tx_stacktrace")
    private String stacktrace;

    @ManyToOne
    @JoinColumn(name = "fk_id_error_level", nullable = false)
    private ErrorLevelTable level;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_id_project", nullable = false)
    private ProjectTable project;

    @Column(name = "created_at")
    private OffsetDateTime createdAt;
}
