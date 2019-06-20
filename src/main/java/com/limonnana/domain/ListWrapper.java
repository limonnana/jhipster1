package com.limonnana.domain;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "list_wrapper")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ListWrapper {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToMany(targetEntity=EntityOnCalendar.class, fetch=FetchType.EAGER)
    private List<EntityOnCalendar> list;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<EntityOnCalendar> getList() {
        return list;
    }

    public void setList(List<EntityOnCalendar> list) {
        this.list = list;
    }
}
