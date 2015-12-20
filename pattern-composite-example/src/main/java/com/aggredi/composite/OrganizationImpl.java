package com.aggredi.composite;

/**
 * Created by Serik Idrissov
 * 12/20/15
 */
public class OrganizationImpl implements Organization {

    private String organizationName;

    private SubordinatesContainer head;

    public OrganizationImpl(String organizationName) {
        this.organizationName = organizationName;
    }

    @Override
    public void setName(String name) {
        organizationName = name;
    }

    @Override
    public String getName() {
        return organizationName;
    }

    @Override
    public SubordinatesContainer getHead() {
        return head;
    }

    @Override
    public void setHead(SubordinatesContainer head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "OrganizationImpl{" +
                "organizationName='" + organizationName + '\'' +
                ", head=" + head +
                '}';
    }
}
