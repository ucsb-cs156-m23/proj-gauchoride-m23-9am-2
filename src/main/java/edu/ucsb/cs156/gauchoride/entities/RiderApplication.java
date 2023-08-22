package edu.ucsb.cs156.gauchoride.entities;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.GeneratedValue;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "riderapplication")
public class RiderApplication {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long userId;
    private String status;
    private String perm_number;
    private Date created_date;
    private Date updated_date;
    private Date cancelled_date;
    private String description;
    private String notes;

}