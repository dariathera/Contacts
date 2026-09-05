package com.example.contacts.ui.mock_data

import com.example.contacts.domain.Contact

val contact1 = Contact(
    name = "Василий",
    surname = null,
    familyName = "Пупкин",
    imageRes = 1,
    isFavorite = false,
    phone = "",
    address = "село Малый Кряж, улица Короткая, дом 5",
    email = null
)

val contact2 = Contact(
    name = "Евдокия",
    surname = "Сергеевна",
    familyName = "Потапова",
    imageRes = null,
    isFavorite = true,
    phone = "8 (495) 755-35-35",
    address = "г. Москва, ул. Неглинная, д. 1",
    email = "potapova@gmail.com"
)
