DROP TABLE IF EXISTS company;

CREATE TABLE company (
    id SERIAL,
    name VARCHAR(255) NOT NULL,
    geometry VARCHAR(255)
);

INSERT INTO company(name, geometry) VALUES ('Vaadin', 'https://vaadin.com');
INSERT INTO company(name, geometry) VALUES ('Red Hat', 'https://www.redhat.com');
INSERT INTO company(name, geometry) VALUES ('Canonical', 'http://www.canonical.com');
INSERT INTO company(name, geometry) VALUES ('Sonatype', 'http://www.sonatype.com');
INSERT INTO company(name, geometry) VALUES ('Alfresco', 'https://www.alfresco.com');
