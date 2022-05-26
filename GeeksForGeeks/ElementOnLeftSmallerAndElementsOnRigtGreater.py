import numpy as np

def get_element_on_lef_smaller_and_elements_on_right_greater(num_arr, len):
    if len == 0:
        return
    left_max = np.empty(len, dtype=object)
    right_min = np.empty(len, dtype=object)
    left_max[0] = num_arr[0]
    right_min[len-1] = num_arr[len-1]
    
    for i in range(1, len):
        left_max[i] = max(left_max[i-1], num_arr[i-1])

    for i in range(len-2, -1, -1):
        right_min[i] = min(right_min[i+1], num_arr[i+1])

    found = False
    for i in range(0, len):
        if left_max[i]<=num_arr[i] and right_min[i]>=num_arr[i]:
            found = True
            print(i)
    
    if not found:
        print(-1)

num_arr = [5, 1, 4, 3, 6, 8, 10, 7, 9]
get_element_on_lef_smaller_and_elements_on_right_greater(num_arr, len(num_arr))