
# Get the zip file of the xcframework from ci   
xcframework_zip="valhalla-wrapper.xcframework.zip"

# Get the checksum of the xcframework file.
xcframework_checksum=$(shasum -a 256 ${xcframework_zip} | awk '{print $1}')
release_url="https://github.com/Rallista/valhalla-mobile/releases/download/$GITHUB_REF/${xcframework_zip}"

echo "Checksum: ${xcframework_checksum}"
echo "Release URL: ${release_url}"

# Replace `let useLocalBinary = true` line with `let useLocalBinary = false` in Package.swift
sed -i '' "s|^let useLocalBinary: Bool = .*|let useLocalBinary: Bool = false|" Package.swift

# Replace `let binaryURL` line with the new binary url for the release artifact in Package.swift
sed -i '' "s|^let binaryURL: String = .*|let binaryURL: String = \"$release_url\"|" Package.swift

# Replace let binaryChecksum: String? = nil with the new binary checksum for the release artifact in Package.swift
sed -i '' "s|^let binaryChecksum: String = .*|let binaryChecksum: String = \"$xcframework_checksum\"|" Package.swift