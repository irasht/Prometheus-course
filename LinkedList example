package com.tasks3.linkedlist;

public class LinkedList {

    private Node first;
    private int listCount;

    /* Конструктор без аргументів */
    public LinkedList() {
        this.first = first;
        listCount = 0;
    }

    /* Додати елемент в кінець списку */
    public void add(Integer data) {
        Node node = new Node();
        node.setData(data);

        if (first == null) {
            first = node;
        } else {
            Node current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }

        listCount++;
    }

    /* Отримати елемент по індексу, повертає null якщо
    такий елемент недоступний */
    public Integer get(int index) {
        if (index < 0 || first == null) {
            return null;
        }

        Node current = first;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return current.getData();
            } else if (current != null) {
                current = current.getNext();
            } else {
                return null;
            }
        }

        return null;
    }

    /* Вилучення елементу за індексом, повертає true у разі успіху або
    false в іншому випадку */

    public boolean delete(int index) {
        if (index < 0 || index > size()) {
            return false;
        }

        if (index == 0) {
            first = first.getNext();
        } else {
            Node current = first;
            for (int i = 0; i < index; i++) {
                if (i == index - 1) {
                    current.setNext(current.getNext().getNext());
                    break;
                } else if (current.getNext() != null) {
                    current = current.getNext();
                } else {
                    return false;
                }
            }
        }

        listCount--;
        return true;
    }

    /*Поверта розмір списку: якщо елементів в
    списку нема то повертає 0 (нуль)*/
    public int size() {
        return listCount;
    }
}
