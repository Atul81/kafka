package atul.poc.kafkalogs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "LOG_INSERTION", schema = "kafka")
@Entity
@Data
public class LogInsertion
{
    @Id
    @Column(name = "LOG_ID")
    private long logId;

    @Column(name = "LOG_DETAILS", length = 65535, columnDefinition="TEXT")
    private String logDetails;
}
