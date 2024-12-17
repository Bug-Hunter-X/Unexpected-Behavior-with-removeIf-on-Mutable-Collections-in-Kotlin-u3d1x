# Unexpected Behavior with removeIf on Mutable Collections in Kotlin

This example demonstrates a potential issue when using the `removeIf` function with mutable collections (lists, sets, and maps) in Kotlin.  The behavior might be unexpected if you're not fully aware of how `removeIf` works internally.

## The Problem

The `removeIf` function modifies the collection in place. While it's generally safe to use with simple predicates, unexpected consequences may arise if your predicate depends on the state of the collection or modifies the collection during the iteration itself.  The `removeIf` method internally uses an iterator to traverse the collection. If the iterator is invalidated due to modifications within the predicate, it may lead to skipping elements or producing incorrect results.

## Reproducible Example

The `Bug.kt` file contains a demonstration where `removeIf` is applied to `MutableList`, `MutableSet`, and `MutableMap`. The outputs are as expected in these cases because the predicate does not depend on the current state of the collection or modify it further during the iteration. However, more complex predicates might trigger unexpected behavior.