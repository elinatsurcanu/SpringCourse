package com.spring.dao;

import com.spring.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//Будет общаться со списком и будет извлекать людей из спика,
// находить человека из списка, добавлять, удалять

@Component
public class PersonDAO {
    private static  int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 24, "tom@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT,"Bob", 25, "bob@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Mike", 28, "mike@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Katy", 35, "katy@mail.ru"));
    }

    public List<Person> index() {
        return  people;
    }

    public Person show(int id) {
        //лямбда выражение
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        //Лямбда выражение
        people.removeIf(p -> p.getId() == id);
    }
}

