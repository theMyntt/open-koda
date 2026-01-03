package org.openkoda.adapters.dao.tables;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@Entity
@Table(name = "tbl_projects")
public class ProjectTable {
    @Id
    @Column(name = "id_project", nullable = false)
    private UUID id;

    @Column(name = "tx_name", nullable = false)
    private String name;

    @Column(name = "tx_language")
    private String language;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "project")
    private List<IssueTable> issues;

    @Column(name = "tx_created_at")
    private OffsetDateTime createdAt;
}
