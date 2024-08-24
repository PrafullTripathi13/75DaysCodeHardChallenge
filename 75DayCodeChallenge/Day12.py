
#Below program is of finding the intersection of two arrays :-

def intersection (arr1, arr2):#This function finds the intersection of two arrays.

    intersection_list = []

    for element in arr1:
        #Check if the element present in arr2 and not already added to the intersection list.
        if element in arr2 and element not in intersection_list:
            intersection_list.append(element)

    return intersection_list

arr1 = [1, 2, 3, 4, 5]
arr2 = [1, 4, 6, 8]

intersection_list = intersection(arr1, arr2)
print(f"Intersection of {arr1} and {arr2} is: {intersection_list}")



# Output of above program :-

# Intersection of [1, 2, 3, 4, 5] and [1, 4, 6, 8] is: [1, 4]