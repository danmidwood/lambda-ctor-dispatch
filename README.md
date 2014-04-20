Java 8 Lambda Constructors
==========================

A proof of concept to test dispatching on message type to create message instances.

### Description

In this PoC the message types are simple ints and the ints each respond to a certain message class. Rather than using a switch or an if-elseif-else block, the message identifiers are keyed against the message constructors in a map.

Each message type requires its own specific data to be passed through in the constructor, but we cannot enforce this in the constructor due to the need of a uniform interface. Therefore each constructor accepts an Object varargs list and the validation of those args is left up to itself. Potentially, we could encode the argument types into the map key.

### Usage

See the Exercisor test class for usage of the dispatcher.

### License

GPL v3
Copyright 2014 Dan Midwood