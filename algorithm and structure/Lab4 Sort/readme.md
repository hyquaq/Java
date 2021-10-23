[5, 17, 2, 7, 14, 12, 8]
quickSort(a, 0, 6)
i < j (0 < 6 => true)
        p = a[i] = a[0] = 5
        m = i = 0
        k = i + 1 = 0 + 1 = 1
                k <= j(1 <= 6 => true)
                        a[k] < p(17 < 5 => false)
        k++ = 1 + 1 = 2
                k <= j(2 <= 6 => true)
                        a[k] < p(2 < 5 => true)
                                m++ = 0 + 1 = 1
                                [5, 17, 2, 7, 14, 12, 8]
                                swap(a, k, m) = swap(a, 2, 1)
                                [5, 2, 17, 7, 14, 12, 8]
        k++ = 2 + 1 = 3
                k <= j(3 <= 6 => true)
                        a[k] < p(7 < 5 => false)
        k++ = 3 + 1 = 4
                k <= j(4 <= 6 => true)
                        a[k] < p(14 < 5 => false)
        k++ = 4 + 1 = 5
                k <= j(5 <= 6 => true)
                        a[k] < p(12 < 5 => false)
        k++ = 5 + 1 = 6
                k <= j(6 <= 6 => true)
                        a[k] < p(8 < 5 => false)
        k++ = 6 + 1 = 7
                k <= j (7 <= 6 => false)
        [5, 2, 17, 7, 14, 12, 8]
        swap(a, i, m) = swap(a, 0, 1)
        [2, 5, 17, 7, 14, 12, 8]
        return m = 1
        pivotIdx = 1
        quickSort(a, 0, 0)
[2, 5, 17, 7, 14, 12, 8]
quickSort(a, 0, 0)
i < j (0 < 0 => false)
        quickSort(a, 2, 6)
[2, 5, 17, 7, 14, 12, 8]
quickSort(a, 2, 6)
i < j (2 < 6 => true)
        p = a[i] = a[2] = 17
        m = i = 2
        k = i + 1 = 2 + 1 = 3
                k <= j(3 <= 6 => true)
                        a[k] < p(7 < 17 => true)
                                m++ = 2 + 1 = 3
                                [2, 5, 17, 7, 14, 12, 8]
                                swap(a, k, m) = swap(a, 3, 3)
                                [2, 5, 17, 7, 14, 12, 8]
        k++ = 3 + 1 = 4
                k <= j(4 <= 6 => true)
                        a[k] < p(14 < 17 => true)
                                m++ = 3 + 1 = 4
                                [2, 5, 17, 7, 14, 12, 8]
                                swap(a, k, m) = swap(a, 4, 4)
                                [2, 5, 17, 7, 14, 12, 8]
        k++ = 4 + 1 = 5
                k <= j(5 <= 6 => true)
                        a[k] < p(12 < 17 => true)
                                m++ = 4 + 1 = 5
                                [2, 5, 17, 7, 14, 12, 8]
                                swap(a, k, m) = swap(a, 5, 5)
                                [2, 5, 17, 7, 14, 12, 8]
        k++ = 5 + 1 = 6
                k <= j(6 <= 6 => true)
                        a[k] < p(8 < 17 => true)
                                m++ = 5 + 1 = 6
                                [2, 5, 17, 7, 14, 12, 8]
                                swap(a, k, m) = swap(a, 6, 6)
                                [2, 5, 17, 7, 14, 12, 8]
        k++ = 6 + 1 = 7
                k <= j (7 <= 6 => false)
        [2, 5, 17, 7, 14, 12, 8]
        swap(a, i, m) = swap(a, 2, 6)
        [2, 5, 8, 7, 14, 12, 17]
        return m = 6
        pivotIdx = 6
        quickSort(a, 2, 5)
[2, 5, 8, 7, 14, 12, 17]
quickSort(a, 2, 5)
i < j (2 < 5 => true)
        p = a[i] = a[2] = 8
        m = i = 2
        k = i + 1 = 2 + 1 = 3
                k <= j(3 <= 5 => true)
                        a[k] < p(7 < 8 => true)
                                m++ = 2 + 1 = 3
                                [2, 5, 8, 7, 14, 12, 17]
                                swap(a, k, m) = swap(a, 3, 3)
                                [2, 5, 8, 7, 14, 12, 17]
        k++ = 3 + 1 = 4
                k <= j(4 <= 5 => true)
                        a[k] < p(14 < 8 => false)
        k++ = 4 + 1 = 5
                k <= j(5 <= 5 => true)
                        a[k] < p(12 < 8 => false)
        k++ = 5 + 1 = 6
                k <= j (6 <= 5 => false)
        [2, 5, 8, 7, 14, 12, 17]
        swap(a, i, m) = swap(a, 2, 3)
        [2, 5, 7, 8, 14, 12, 17]
        return m = 3
        pivotIdx = 3
        quickSort(a, 2, 2)
[2, 5, 7, 8, 14, 12, 17]
quickSort(a, 2, 2)
i < j (2 < 2 => false)
        quickSort(a, 4, 5)
[2, 5, 7, 8, 14, 12, 17]
quickSort(a, 4, 5)
i < j (4 < 5 => true)
        p = a[i] = a[4] = 14
        m = i = 4
        k = i + 1 = 4 + 1 = 5
                k <= j(5 <= 5 => true)
                        a[k] < p(12 < 14 => true)
                                m++ = 4 + 1 = 5
                                [2, 5, 7, 8, 14, 12, 17]
                                swap(a, k, m) = swap(a, 5, 5)
                                [2, 5, 7, 8, 14, 12, 17]
        k++ = 5 + 1 = 6
                k <= j (6 <= 5 => false)
        [2, 5, 7, 8, 14, 12, 17]
        swap(a, i, m) = swap(a, 4, 5)
        [2, 5, 7, 8, 12, 14, 17]
        return m = 5
        pivotIdx = 5
        quickSort(a, 4, 4)
[2, 5, 7, 8, 12, 14, 17]
quickSort(a, 4, 4)
i < j (4 < 4 => false)
        quickSort(a, 6, 5)
[2, 5, 7, 8, 12, 14, 17]
quickSort(a, 6, 5)
i < j (6 < 5 => false)
        quickSort(a, 7, 6)
[2, 5, 7, 8, 12, 14, 17]
quickSort(a, 7, 6)
i < j (7 < 6 => false)
[2, 5, 7, 8, 12, 14, 17]