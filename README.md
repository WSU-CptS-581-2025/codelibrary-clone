[![GitHub stars](https://img.shields.io/github/stars/indy256/codelibrary.svg?style=flat&label=star)](https://github.com/indy256/codelibrary/)
[![Build Status](https://travis-ci.org/indy256/codelibrary.svg?branch=master)](https://travis-ci.org/indy256/codelibrary)
[![License](https://img.shields.io/badge/license-UNLICENSE-green.svg)](https://github.com/indy256/codelibrary/blob/master/UNLICENSE)

### Collection of algorithms and data structures in C++ and Java

#### Data structures
+ [x] Segment tree [**c++**](cpp/structures/segment_tree_interval_add_max.cpp) [**java**](java/structures/SegmentTreeIntervalAddMax.java)
+ [x] Segment tree for sum with lowerBound operation [**java**](java/structures/SegmentTreeSumLowerBound.java)
+ [x] Segment tree without recursion [**java**](java/structures/SegmentTreeSimple.java)
+ [x] Fenwick tree [**c++**](cpp/structures/fenwick_tree.cpp) [**java**](java/structures/FenwickTree.java)
+ [x] Fenwick tree with extended operations [**java**](java/structures/FenwickTreeExtended.java)
+ [x] Persistent tree [**java**](java/structures/PersistentTree.java)
+ [x] Centroid decomposition [**c++**](cpp/structures/centroid_decomposition.cpp) [**java**](java/structures/CentroidDecomposition.java)
+ [x] Heavy/light decomposition [**java**](java/structures/HeavyLight.java)
+ [x] Link/cut tree [**java**](java/structures/LinkCutTree.java)
+ [x] Link/cut tree for connectivity query [**java**](java/structures/LinkCutTreeConnectivity.java)
+ [x] Link/cut tree for LCA query [**java**](java/structures/LinkCutTreeLca.java)
+ [x] Binary heap [**java**](java/structures/BinaryHeap.java)
+ [x] Binary heap with change priority [**java**](java/structures/BinaryHeapExtended.java)
+ [x] Disjoint sets [**c++**](cpp/structures/disjoint_sets.cpp) [**java**](java/structures/DisjointSets.java)
+ [x] Treap with implicit key [**java**](java/structures/TreapImplicitKey.java)
+ [x] Treap as BST [**c++**](cpp/structures/treap_bst.cpp) [**java**](java/structures/TreapBst.java)
+ [x] k-d tree for point query [**c++**](cpp/structures/kd_tree.cpp) [**java**](java/structures/KdTreePointQuery.java)
+ [x] k-d tree for rectangular query [**java**](java/structures/KdTreeRectQuery.java)
+ [x] R-tree [**java**](java/structures/RTree.java)
+ [x] Metric tree [**java**](java/structures/MetricTree.java)
+ [x] Quadtree [**java**](java/structures/QuadTree.java)
+ [x] Mergeable heap [**java**](java/structures/MergeableHeap.java)
+ [x] Queue with minimum [**c++**](cpp/structures/queue_min.cpp) [**java**](java/structures/QueueMin.java)
+ [x] Sparse table for RMQ [**java**](java/structures/RmqSparseTable.java)

#### Graph algorithms
+ [x] Shortest paths [**c++**](cpp/graphs/shortestpaths) [**java**](java/graphs/shortestpaths)
+ [x] Maximum flow [**c++**](cpp/graphs/flows) [**java**](java/graphs/flows)
+ [x] Maximum matching [**c++**](cpp/graphs/matchings) [**java**](java/graphs/matchings)
+ [ ] Maximum weighted matching in general graph ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/38))
+ [x] Spanning tree [**c++**](cpp/graphs/spanningtree) [**java**](java/graphs/spanningtree)
+ [x] Connectivity [**c++**](cpp/graphs/dfs) [**java**](java/graphs/dfs)
+ [x] Biconnectivity [**c++**](cpp/graphs/dfs) [**java**](java/graphs/dfs)
+ [x] LCA [**c++**](cpp/graphs/lca) [**java**](java/graphs/lca)
+ [ ] Planarity testing ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/28))
+ [ ] Dynamic graph connectivity ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/29))
+ [ ] Chu–Liu/Edmonds' algorithm ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/30))
+ [ ] Minimum augmentation to strong connectivity ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/32))
+ [ ] Minimum augmentation to biconnectivity ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/33))

#### String algorithms
+ [x] Knuth-Morris-Pratt algorithm [**c++**](cpp/strings/kmp.cpp) [**java**](java/strings/Kmp.java)
+ [x] Aho-Corasick algorithm [**c++**](cpp/strings/aho-corasick.cpp) [**java**](java/strings/AhoCorasick.java)
+ [x] Suffix array. Radix sort algorithm in O(n*log(n)) [**c++**](cpp/strings/suffix-array.cpp) [**java**](java/strings/SuffixArray.java)
+ [x] Suffix array. Algorithm DC3 in O(n) [**c++**](cpp/strings/suffix-array-dc3.cpp) [**java**](java/strings/SuffixArrayDC3.java)
+ [x] Suffix automaton [**c++**](cpp/strings/suffix-automaton.cpp) [**java**](java/strings/SuffixAutomaton.java)
+ [x] Suffix tree [**java**](java/strings/SuffixTree.java)
+ [x] Trie [**java**](java/strings/Trie.java)
+ [x] Z-function [**c++**](cpp/strings/z-function.cpp) [**java**](java/strings/ZFunction.java)
+ [x] Hashing [**java**](java/strings/Hashing.java)
+ [x] Parsing [**java**](java/parsing)
+ [ ] Implement palindrome tree ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/34))
+ [ ] Sorting strings in linear time ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/31))

#### Sorting algorithms
+ [x] Sorting algorithms [**c++**](cpp/sort/sort.cpp) [**java**](java/sort/Sort.java)
+ [x] N-th element [**java**](java/sort/NthElement.java)

#### Geometry algorithms
+ [x] Segments intersection [**c++**](cpp/geometry/segments_intersection.cpp) [**java**](java/geometry/SegmentsIntersection.java)
+ [x] Line operations [**java**](java/geometry/LineGeometry.java)
+ [x] Circle operations [**java**](java/geometry/CircleOperations.java)
+ [x] Convex hull [**c++**](cpp/geometry/convex_hull.cpp) [**java**](java/geometry/ConvexHull.java)
+ [x] Point in polygon query [**c++**](cpp/geometry/point_in_polygon.cpp) [**java**](java/geometry/PointInPolygon.java)
+ [x] Closest pair of points [**java**](java/geometry/Closest2Points.java)
+ [x] Furthest pair of points [**c++**](cpp/geometry/diameter.cpp)
+ [ ] Implement quaternion ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/35))

#### Optimization
+ [x] Simplex algorithm [**java**](java/optimization/Simplex.java)

#### Numerical algorithms
+ [x] Long arithmetics [**c++**](cpp/numeric/bigint.cpp)
+ [x] Fast Fourier transform [**c++**](cpp/numeric/fft.cpp) [**java**](java/numeric/FFT.java)
+ [x] Karatsuba multiplication [**java**](java/numeric/KaratsubaMultiply.java)
+ [x] Newton interpolation [**java**](java/numeric/NewtonInterpolation.java)
+ [x] Laguerre's root-finding algorithm [**c++**](cpp/numeric/polynom-roots.cpp)

#### Number theory
+ [x] Primes and divisors [**java**](java/numbertheory/PrimesAndDivisors.java) [**c++**](cpp/numbertheory/primes_and_divisors.cpp)
+ [x] Factorization [**java**](java/numbertheory/Factorization.java) [**c++**](cpp/numbertheory/factorization.cpp)
+ [x] Euclidean algorithm [**java**](java/numbertheory/Euclid.java) [**c++**](cpp/numbertheory/euclid.cpp)
+ [x] Multiplicative function [**java**](java/numbertheory/MultiplicativeFunction.java)
+ [x] Rational numbers [**java**](java/numbertheory/Rational.java)
+ [ ] Implement polynom class ([contribute a link or implementation](https://github.com/indy256/codelibrary/issues/36))

#### Combinatorics
+ [x] Permutations [**java**](java/combinatorics/Permutations.java)
+ [x] Combinations [**java**](java/combinatorics/Combinations.java)
+ [x] Arrangements [**java**](java/combinatorics/Arrangements.java)
+ [x] Partitions [**java**](java/combinatorics/Partitions.java)
+ [x] Binomial coefficients [**java**](java/combinatorics/BinomialCoefficients.java)

#### Linear algebra
+ [x] Gaussian elimination [**c++**](cpp/linearalgebra/gauss.cpp) [**java**](java/linearalgebra/Gauss.java)
+ [x] Determinant calculation [**java**](java/linearalgebra/Determinant.java)
+ [x] Matrix operations [**c++**](cpp/linearalgebra/matrix.cpp) [**java**](java/linearalgebra/Matrix.java)
