# Fenwick Tree (Binary Indexed Tree)

A Fenwick Tree supports two operations in **O(log n)**:
- `update(i, delta)` — adds delta to position i
- `query(i)` — returns the prefix sum from 1 to i

## How it works

The core trick is the **LSB (Least Significant Bit)** — the first `1` bit from the right. Its value is always a power of 2.

**Rule: the number of trailing zeros in binary determines the LSB — it equals 2 raised to that count.**

| i | binary (4 bits) | trailing zeros | LSB |
|---|-----------------|----------------|-----|
| 1 | 0001            | 0              | 1   |
| 2 | 0010            | 1              | 2   |
| 3 | 0011            | 0              | 1   |
| 4 | 0100            | 2              | 4   |
| 5 | 0101            | 0              | 1   |
| 6 | 0110            | 1              | 2   |
| 7 | 0111            | 0              | 1   |
| 8 | 1000            | 3              | 8   |

Examples: `6 = 110` → 1 trailing zero → LSB = 2¹ = 2. `4 = 100` → 2 trailing zeros → LSB = 2² = 4.

In code: `lsb = i and (-i)`

- **update**: `idx += idx and (-idx)` — moves up the tree
- **query**: `idx -= idx and (-idx)` — moves down the tree

## Usage

```kotlin
val tree = FenwickTree(10)
tree.update(3, 5)   // add 5 at position 3
tree.query(3)       // prefix sum [1..3]
```
