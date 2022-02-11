package com.tusir.tusirmusic.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @author Tusir
 * @version 1.0.0
 */
@Entity
@Data
public class Role extends AbstractEntity{

    private String name;
    private String title;
}
