package com.dictionary.fakedatabinding.data

import com.dictionary.fakedatabinding.model.Person

object FakeData {

    val listOfPerson = ArrayList<Person>()

    fun generateList(){
        listOfPerson.add(
            Person(
                "Craig Fox",
                "https://randomuser.me/api/portraits/men/9.jpg",
                "(434)-706-3060"
            )
        )
        listOfPerson.add(
            Person(
                "Brittany Long",
                "https://uinames.com/api/photos/female/2.jpg",
                "(958) 564 2068"
            )
        )
        listOfPerson.add(
            Person(
                "Bob Miles",
                "https://randomuser.me/api/portraits/men/2.jpg",
                "(198)-275-7927"
            )
        )
        listOfPerson.add(
            Person(
                "Frances Garrett",
                "https://uinames.com/api/photos/female/22.jpg",
                "(156) 327 3473"
            )
        )
        listOfPerson.add(
            Person(
                "Donna Brown",
                "https://uinames.com/api/photos/female/7.jpg",
                "(882) 657 8508"
            )
        )
        listOfPerson.add(
            Person(
                "Michael Hoffman",
                "https://uinames.com/api/photos/male/16.jpg",
                "(548) 943 3203"
            )
        )
        listOfPerson.add(
            Person(
                "Arthur Morrison",
                "https://uinames.com/api/photos/male/5.jpg",
                "(259) 760 4069"
            )
        )
        listOfPerson.add(
            Person(
                "Paula Tucker",
                "https://randomuser.me/api/portraits/women/36.jpg",
                "(445)-639-5027"
            )
        )
        listOfPerson.add(
            Person(
                "Tracey Morgan",
                "https://randomuser.me/api/portraits/women/38.jpg",
                "(403)-286-1989"
            )
        )
        listOfPerson.add(
            Person(
                "Eugene Black",
                "https://uinames.com/api/photos/male/15.jpg",
                "(896) 548 4357"
            )
        )
        listOfPerson.add(
            Person(
                "Henry Guzman",
                "https://uinames.com/api/photos/male/19.jpg",
                "(719) 862 7942"
            )
        )
        listOfPerson.add(
            Person(
                "Joan Chavez",
                "https://uinames.com/api/photos/female/24.jpg",
                "(423) 344 6768"
            )
        )
        listOfPerson.add(
            Person(
                "Douglas Cook",
                "https://uinames.com/api/photos/male/12.jpg",
                "(679) 145 1148"
            )
        )
        listOfPerson.add(
            Person(
                "Jose Hawkins",
                "https://uinames.com/api/photos/male/7.jpg",
                "(984) 291 7010"
            )
        )
    }

    fun getTheList():ArrayList<Person>{
        if (listOfPerson.size == 0){
            generateList()
        }
        return listOfPerson
    }

}