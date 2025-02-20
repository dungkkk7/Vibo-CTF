def decode():
    # Chuỗi mã hóa từ hàm valid
    encoded = "eHAWo\\lfWH;uhNVPX;;hu<>=uDZFI>m"
    
    # Khởi tạo mảng kết quả với độ dài 32
    result = ['0'] * 32
    
    # Biết ký tự cuối cùng là 'z'
    result[31] = '}'
    
    # Giải mã ngược từ cuối lên, chạy từ index 30 xuống 0
    for i in range(30, -1, -1):
        # Từ công thức: (input[i+1] ^ input[i]) + 0x3b = encoded[i]
        # Suy ra: input[i] = input[i+1] ^ (encoded[i] - 0x3b)
        next_char = ord(result[i + 1])
        target = ord(encoded[i]) - 0x3b
        current_char = next_char ^ target
        result[i] = chr(current_char)
    
    # Ghép các ký tự lại thành chuỗi
    flag = ''.join(result)
    return flag

# Chạy script và in kết quả
flag = decode()
print("Flag found:", flag)

# Verify kết quả
def verify(input_str):
    if len(input_str) != 32:
        print("Input length must be 32")
        return False
        
    encoded = "eHAWo\\lfWH;uhNVPX;;hu<>=uDZFI>m"
    for i in range(len(encoded)):
        if (ord(input_str[i + 1]) ^ ord(input_str[i])) + 0x3b != ord(encoded[i]):
            return False
    return True

print("Verification:", verify(flag))