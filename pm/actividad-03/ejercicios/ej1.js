import { Text, View, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {

  const [text1, setText1] = useState("Text");
  const [text2, setText2] = useState("Text");
  const [text3, setText3] = useState("Text");
  const [text4, setText4] = useState("Text");

  function textOnPress(id) {
    if (id === 1) text1 === "Text" ? setText1("Changed text") : setText1("Text");
    if (id === 2) text2 === "Text" ? setText2("Changed text") : setText2("Text");
    if (id === 3) text3 === "Text" ? setText3("Changed text") : setText3("Text");
    if (id === 4) text4 === "Text" ? setText4("Changed text") : setText4("Text");
  }

  return (
    <View style={styles.container}>
      <Text style={styles.text} onPress={() => textOnPress(1)}>
        {text1}
      </Text>
      <Text style={styles.text} onPress={() => textOnPress(2)}>
        {text2}
      </Text>
      <Text style={styles.text} onPress={() => textOnPress(3)}>
        {text3}
      </Text>
      <Text style={styles.text} onPress={() => textOnPress(4)}>
        {text4}
      </Text>
    </View>
  )
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    fontSize: 30,
    marginBottom: 20, 
  }
})