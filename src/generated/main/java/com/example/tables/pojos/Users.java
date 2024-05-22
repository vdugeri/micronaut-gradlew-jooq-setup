/*
 * This file is generated by jOOQ.
 */
package com.example.tables.pojos;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private UUID id;
    private String firstName;
    private String lastName;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public Users() {}

    public Users(Users value) {
        this.id = value.id;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.createdAt = value.createdAt;
        this.updatedAt = value.updatedAt;
    }

    public Users(UUID id, String firstName, String lastName, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public UUID getId() {
        return this.id;
    }

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for <code>public.users.first_name</code>.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Setter for <code>public.users.first_name</code>.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter for <code>public.users.last_name</code>.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Setter for <code>public.users.last_name</code>.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter for <code>public.users.created_at</code>.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>public.users.created_at</code>.
     */
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for <code>public.users.updated_at</code>.
     */
    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>public.users.updated_at</code>.
     */
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        final Users other = (Users) obj;
        if (this.id == null) {
            if (other.id != null) return false;
        } else if (!this.id.equals(other.id)) return false;
        if (this.firstName == null) {
            if (other.firstName != null) return false;
        } else if (!this.firstName.equals(other.firstName)) return false;
        if (this.lastName == null) {
            if (other.lastName != null) return false;
        } else if (!this.lastName.equals(other.lastName)) return false;
        if (this.createdAt == null) {
            if (other.createdAt != null) return false;
        } else if (!this.createdAt.equals(other.createdAt)) return false;
        if (this.updatedAt == null) {
            if (other.updatedAt != null) return false;
        } else if (!this.updatedAt.equals(other.updatedAt)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.firstName == null) ? 0 : this.firstName.hashCode());
        result = prime * result + ((this.lastName == null) ? 0 : this.lastName.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Users (");

        sb.append(id);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
